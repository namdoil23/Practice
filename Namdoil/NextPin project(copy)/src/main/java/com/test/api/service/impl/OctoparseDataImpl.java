package com.test.api.service.impl;

import ch.qos.logback.classic.Logger;
import com.test.api.service.OctoparseData;
import com.test.api.service.ReadBzyXml;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class OctoparseDataImpl implements OctoparseData {

    private Logger logger = (Logger) LoggerFactory.getLogger(OctoparseDataImpl.class);
    private final ReadBzyXml readBzyXml;

    @Override
    public void getData() {

        // Octoparse 계정
        String userName = readBzyXml.getKeyName("userName");
        String passWord = readBzyXml.getKeyName("passWord");
        logger.debug("userName: " + userName);

        // Access token
        String tokenUrl = "http://dataapi.octoparse.com/token";
        String getToken = GetToken(userName, passWord, tokenUrl);
        logger.debug("getToken: " + getToken);

        // 객체로 매핑하기 위한 변환하기 위한 작업
        JSONParser parser = new JSONParser();
        Object obj = null;
        JSONObject jsonObj = null;
        try {
            obj = parser.parse(getToken);
            jsonObj = (JSONObject) obj;
        } catch (ParseException e) {
            logger.error(e.getMessage());
        }
        String access_token = jsonObj.get("access_token").toString();
        logger.debug("access_token: " + access_token);

        String refresh_token = jsonObj.get("refresh_token").toString();
        logger.debug("refresh_token: " + refresh_token);




    }

    public String GetToken(String userName, String passWord, String tokenUrl) {
        String token = null;
        if (null != userName && null != passWord && null != tokenUrl) {
            String postdata = String.format(
                    "username=%s&password=%s&grant_type=password", userName,
                    passWord);
            String responseText = sendPost(tokenUrl,postdata);
            logger.debug("responseText: " + responseText);
            if (responseText.contains("access_token")) {
                token = responseText;// JObject.Parse(responseText)["access_token"].ToString();
            }
        }
        return token;
    }

    /**
     * To specify the URL to send the request of the POST method
     *
     * @param url
     *            Send the request URL
     * @param param
     *            Request parameters, request parameters should be name1 = value1 & name2 = value2 form.
     * @return Represents a remote resource response results
     */
    public String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // The connection between the opening and the URL
            HttpURLConnection conn = (HttpURLConnection) realUrl
                    .openConnection();
            // Set the request of the general properties
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);// Use the URL connection for output
            conn.setDoInput(true);//Use the URL connection for input

            byte[] requestStringBytes = param.getBytes("utf-8");

            // To build the output stream and write data
            OutputStream outputStream = conn.getOutputStream();
            outputStream.write(requestStringBytes);
            outputStream.close();
            // Get the response status
            int responseCode = conn.getResponseCode();
            logger.debug("responseCode: " + responseCode);
            if (HttpURLConnection.HTTP_OK == responseCode) {// The connection is successful
                logger.debug("API URL 호출 성공");
                // When the correct response to process the data
                StringBuffer sb = new StringBuffer();
                String readLine;
                BufferedReader responseReader;
                //Process the response flow, must be consistent with the server response stream output coding
                responseReader = new BufferedReader(new InputStreamReader(
                        conn.getInputStream(), "utf-8"));
                while ((readLine = responseReader.readLine()) != null) {
                    sb.append(readLine).append("\n");
                    logger.debug("응답 값 : " + readLine);
                }
                responseReader.close();
                result = sb.toString();

            }
        } catch (Exception e) {
            System.out.println("Send a POST request is abnormal!" + e);
            e.printStackTrace();
        }


        // Use a finally block to close the output stream and the input stream
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}

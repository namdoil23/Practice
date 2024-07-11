package com.test.api.controller;

import ch.qos.logback.classic.Logger;
import com.test.api.service.ExcelManageRestService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
@RequiredArgsConstructor
public class ExcelManageRestController {

    private Logger logger = (Logger) LoggerFactory.getLogger(ExcelManageRestController.class);
    private final ExcelManageRestService excelManageRestService;

    @PostMapping("/uploadExcel")
    public String uploadExcel(@RequestParam("uploadFile") MultipartFile file, HttpServletResponse response) throws IOException {

        String fileExtension = FilenameUtils.getExtension(file.getOriginalFilename());

        logger.debug("파일 확장자 명 : " + fileExtension);
//        logger.debug("file.getContentType() : " + file.getContentType());
        BufferedReader br = null;

        if(null != fileExtension && fileExtension.equals("csv")) {
            String line;
            InputStream is = file.getInputStream();
            br = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
            while((line = br.readLine()) != null){
//                logger.debug(line);
            }
        }

        return "uploadProcessing";
    }
}

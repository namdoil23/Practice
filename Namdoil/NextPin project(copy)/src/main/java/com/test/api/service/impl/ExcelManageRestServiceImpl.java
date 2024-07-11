package com.test.api.service.impl;

import com.test.api.service.ExcelManageRestService;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelManageRestServiceImpl implements ExcelManageRestService {

    public List<String> readExcel(MultipartFile file) throws IOException{

        List<String> excelDataList = new ArrayList<String>();

        InputStream inputStream = file.getInputStream();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getPhysicalNumberOfRows();



        return excelDataList;
    }
}

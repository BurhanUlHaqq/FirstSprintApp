package com.firstsprintapp.firstsprintapp.school.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.1/info")
public class SchoolInfoCont {
    private SchoolServiceInfo schoolServiceInfo;

    @Autowired
    public SchoolInfoCont(SchoolServiceInfo schoolServiceInfo) {
        this.schoolServiceInfo = schoolServiceInfo;
    }


    @GetMapping
    public List<SchoolInfo> getInfo() {
        return schoolServiceInfo.getSchoolInfo();
    }

    @PutMapping
    public void updateInfo(@RequestBody SchoolInfo schoolInfo) {
        schoolInfo.setId(1L);
        schoolServiceInfo.saveSchoolInfo(schoolInfo);
    }
}

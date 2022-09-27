package com.firstsprintapp.firstsprintapp.school.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceInfo {
    private SchoolInfoRepo schoolInfoRepo;

    @Autowired
    public SchoolServiceInfo(SchoolInfoRepo schoolInfoRepo) {
        this.schoolInfoRepo = schoolInfoRepo;
    }

    public List<SchoolInfo> getSchoolInfo()
    {
        return schoolInfoRepo.findAll();
    }
    public void saveSchoolInfo(SchoolInfo schoolInfo) {
        schoolInfoRepo.save(schoolInfo);
    }
}

package com.test.awstest.domain.file;

import com.test.awstest.global.s3.S3MediaIUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class FileUploadTestController {
    private final S3MediaIUtil s3MediaIUtil;

    // 파일 업로드 테스트
    @PostMapping("/test/file")
    public String fileUploadTest(@RequestPart MultipartFile file) {

        return s3MediaIUtil.saveFile(file,"test");
    }
}

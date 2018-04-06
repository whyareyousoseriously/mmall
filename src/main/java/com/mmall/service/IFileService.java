package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by power on 2018/4/6.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}

package com.hackathon.server.dto;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class MenuPostReq {
    private String menuNm;
//    private MultipartFile menuImage;
    private Long userId;
    private String deliveryAddress;
    private int recruitNum;
    private LocalDateTime dueTime;
    private List<Long> ingredients;
}

package com.cos.myjpa.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonRespDto<T> {
	
	private int statusCode; // 1: 정상, -1: 실패
	private String msg; // 오류 내용 Value too long for column "TITLE VARCHAR(60)"
	private T data;
}

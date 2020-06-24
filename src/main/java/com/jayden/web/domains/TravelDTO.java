package com.jayden.web.domains;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data

@Component
public class TravelDTO {
	private String seqNo, areaNm, statNm, statCd, statlnNm, statoutNo, etcSt ,urlSt;
}

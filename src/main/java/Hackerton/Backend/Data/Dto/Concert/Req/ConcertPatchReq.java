package Hackerton.Backend.Data.Dto.Concert.Req;

import Hackerton.Backend.Data.Enum.GenreEnum;
import Hackerton.Backend.Data.Enum.RegionEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConcertPatchReq {

    @Schema(description = "수정할 콘서트의 id")
    private Long id;

    @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date concertDate;

    @Schema(description = "지역", example = "INCHEON")
    private RegionEnum region;

    @Schema(description = "장르", example = "HIPHOP")
    private GenreEnum genre;

    @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date fundingDate;

    @Schema(description = "펀딩 금액", example = "203912049321093")
    private Integer fundingPrice;

    @Schema(description = "위도", example = "38")
    private Float latitude;

    @Schema(description = "경도", example = "38")
    private Float longitude;

    @Schema(description = "업로드 할 파일")
    private List<MultipartFile> multipartFileList;

    @Schema(description = "삭제할 파일 Id 리스트")
    private List<Integer> deleteFileList;
}

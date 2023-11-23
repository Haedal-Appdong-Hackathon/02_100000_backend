package Hackerton.Backend.Data.Dto.Artist.Res;

import Hackerton.Backend.Data.Entity.Artist;
import Hackerton.Backend.Data.Entity.ConcertReview;
import Hackerton.Backend.Data.Entity.User;
import Hackerton.Backend.Data.Enum.GenreEnum;
import Hackerton.Backend.Data.Enum.RegionEnum;
import io.swagger.v3.oas.annotations.media.Schema;

public class ArtistInformationRes {

    @Schema(description = "아티스트의 이름 ", example = "박종혁")
    private String artistName;

    @Schema(description = "아티스트 장르 ", example = "힙합")
    private GenreEnum genre;

    @Schema(description = "아티스트 지역 ", example = "대구")
    private RegionEnum region;

    @Schema(description = "아티스트 유튜브 Url ", example = "https://youtu.be/Z7lyMucsaHE?si=xWb2wQr-d3NMNahv")
    private String intro;

    @Schema(description = "아티스트 유저", example = "")
    private User user;

    public ArtistInformationRes(Artist artist) {
        this.artistName = artist.getArtistName();
        this.genre = artist.getGenre();
        this.region = artist.getRegion();
        this.intro = artist.getIntro();
        this.user = artist.getUser();
    }

}

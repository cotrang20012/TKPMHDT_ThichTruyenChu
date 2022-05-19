package mobile.model.payload.request.novel;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class UpdateNovelRequest {
    protected String tentruyen;
    protected String id;
    protected String theloai;
    protected String tacgia;
    protected String url;
    protected String hinhanh;
    protected String noidung;
}

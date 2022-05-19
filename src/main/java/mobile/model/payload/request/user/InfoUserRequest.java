package mobile.model.payload.request.user;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InfoUserRequest {
    protected  String tenhienthi;
    protected Date birthdate;
    protected  String image;

}

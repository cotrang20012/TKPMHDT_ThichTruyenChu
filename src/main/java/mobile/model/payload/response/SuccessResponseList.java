package mobile.model.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SuccessResponseList {
    private Boolean success;
    private int status;
    private String message;
    private List data;

    public SuccessResponseList(){
        this.data = new ArrayList();
    }
}

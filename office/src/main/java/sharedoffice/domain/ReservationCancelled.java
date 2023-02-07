package sharedoffice.domain;

import sharedoffice.domain.*;
import sharedoffice.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReservationCancelled extends AbstractEvent {

    private String rsvId;
    private String officeId;
    private String status;
    private String payId;
}



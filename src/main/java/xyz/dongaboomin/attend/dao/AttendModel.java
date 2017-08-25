package xyz.dongaboomin.attend.dao;

import xyz.dongaboomin.attend.dto.AttendCountDTO;
import xyz.dongaboomin.attend.dto.AttendDTO;
import xyz.dongaboomin.attend.dto.AttendLetterDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by horse on 2017. 8. 16..
 */
public interface AttendModel {
    List<AttendLetterDTO> showAttendLetterList(int limit, int offset, int admin_id);
    List<AttendDTO> showAttendList(int limit, int offset, int pcnotis_id);
    long countLetterTable(int admin_id);
    List<AttendCountDTO> countAttendPerson(int pcircle_notis_id);
}

package com.office.attendance_service.service;

import com.office.attendance_service.model.Attendance;
import com.office.attendance_service.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    // Create Attendance
    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    // Get all Attendance records
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    // Get Attendance by ID
    public Optional<Attendance> getAttendanceById(Long id) {
        return attendanceRepository.findById(id);
    }

    // Update Attendance
    public Attendance updateAttendance(Long id, Attendance attendance) {
        if (attendanceRepository.existsById(id)) {
            attendance.setId(id);
            return attendanceRepository.save(attendance);
        }
        return null;
    }

    // Delete Attendance
    public boolean deleteAttendance(Long id) {
        if (attendanceRepository.existsById(id)) {
            attendanceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

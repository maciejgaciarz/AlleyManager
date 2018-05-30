package com.bowlingcenter.alleymanager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<CallLog, Long> {
}

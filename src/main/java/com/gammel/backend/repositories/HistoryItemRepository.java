package com.gammel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gammel.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}

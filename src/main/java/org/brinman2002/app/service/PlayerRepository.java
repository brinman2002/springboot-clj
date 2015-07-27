package org.brinman2002.app.service;

import org.brinman2002.app.domain.Player;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
}

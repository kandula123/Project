package tracking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    // You can define custom queries here if needed
}


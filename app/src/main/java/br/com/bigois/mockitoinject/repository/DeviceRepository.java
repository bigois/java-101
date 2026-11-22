package br.com.bigois.mockitoinject.repository;

import br.com.bigois.mockitoinject.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}

package com.criativity.mapa_acessibilidade;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(properties = {
		"spring.jpa.database-platform=org.hibernate.dialect.H2Dialect",
		"spring.datasource.url=jdbc:h2:mem:testdb",
		"spring.datasource.driver-class-name=org.h2.Driver",
		"spring.datasource.username=sa",
		"spring.datasource.password=",
		"spring.jpa.hibernate.ddl-auto=create-drop"
})
@ActiveProfiles("test")
class MapaAcessibilidadeApplicationTests {

	@Test
	void contextLoads() {
	}

}

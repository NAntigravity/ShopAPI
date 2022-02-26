package testtask.shift.shopapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class PersonalComputer extends Product {
    @Getter
    @Setter
    private FormFactor formFactor;

    public PersonalComputer() {
    }

    public PersonalComputer(String seriesNumber, String producer, BigDecimal price, Long numberOfProductsInStock, FormFactor formFactor) {
        super(seriesNumber, producer, price, numberOfProductsInStock);
        this.formFactor = formFactor;
    }

    public PersonalComputer(Long id, String seriesNumber, String producer, BigDecimal price, Long numberOfProductsInStock, FormFactor formFactor) {
        super(id, seriesNumber, producer, price, numberOfProductsInStock);
        this.formFactor = formFactor;
    }
}

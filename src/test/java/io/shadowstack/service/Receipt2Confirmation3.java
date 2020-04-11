package io.shadowstack.service;

import io.shadowstack.AdapterException;
import io.shadowstack.ArgumentConverter;
import io.shadowstack.model.Confirmation;
import io.shadowstack.model.Receipt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Receipt2Confirmation3 extends ArgumentConverter<Receipt, Confirmation> {
    static Receipt2Confirmation3 SINGLETON = Mappers.getMapper(Receipt2Confirmation3.class);

    @Override
    @Mapping(target = "total", source = "total")
    Confirmation convert(Receipt from) throws AdapterException;

    @Override
    @Mapping(target = "total", source = "total")
    void convert(Receipt from, @MappingTarget Confirmation to) throws AdapterException;
}
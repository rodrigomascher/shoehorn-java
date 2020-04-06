package io.shadowstack.service;

import io.shadowstack.AdapterException;
import io.shadowstack.ArgumentConverter;
import io.shadowstack.model.PhysicalCart;
import io.shadowstack.model.VirtualCart;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.lang.invoke.MethodHandles;

@Mapper(uses = {VirtualProduct2PhysicalProduct.class})
public interface VirtualCart2PhysicalCart extends ArgumentConverter<VirtualCart, PhysicalCart> {
    VirtualCart2PhysicalCart INSTANCE = Mappers.getMapper(VirtualCart2PhysicalCart.class);

    @Override
    PhysicalCart convert(VirtualCart from) throws AdapterException;

    @Override
    void convert(VirtualCart from, @MappingTarget PhysicalCart to) throws AdapterException;

    static ArgumentConverter<?, ?> instance() {
        return (ArgumentConverter<?, ?>) Mappers.getMapper(MethodHandles.lookup().lookupClass());
    }
}
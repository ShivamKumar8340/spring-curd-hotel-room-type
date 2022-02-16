package com.suglowsys.service;

import com.suglowsys.domain.HotelRoomType;
import com.suglowsys.repository.HotelRoomTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRoomTypeServiceImpl implements HotelRoomTypeService{

    private final HotelRoomTypeRepository hotelRoomTypeRepository;

    public HotelRoomTypeServiceImpl(HotelRoomTypeRepository hotelRoomTypeRepository) {
        this.hotelRoomTypeRepository = hotelRoomTypeRepository;
    }

    @Override
    public HotelRoomType save(HotelRoomType hotelRoomType) {
        return hotelRoomTypeRepository.save(hotelRoomType);
    }

    @Override
    public HotelRoomType update(HotelRoomType hotelRoomType, Long id) {
        HotelRoomType hotelRoomType1=hotelRoomTypeRepository.getById(id);
        hotelRoomType1.setHotel_id(hotelRoomType.getHotel_id());
        return hotelRoomTypeRepository.save(hotelRoomType1);
    }

    @Override
    public List<HotelRoomType> findAll() {
        return hotelRoomTypeRepository.findAll();
    }

    @Override
    public HotelRoomType findById(Long id) {
        Optional optional=hotelRoomTypeRepository.findById(id);
        Object hotelRoomType=null;
        if(optional.isPresent()) {
            hotelRoomType=optional.get();
        }
        else {
            throw new RuntimeException("record not found for IdNO"+id);

        }

        return (HotelRoomType) hotelRoomType;
    }

    @Override
    public void delete(Long id) {
        hotelRoomTypeRepository.deleteById(id);

    }
}

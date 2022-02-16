package com.suglowsys.service;

import com.suglowsys.domain.HotelRoomType;

import java.util.List;

public interface HotelRoomTypeService {

    HotelRoomType save(HotelRoomType hotelRoomType);

    HotelRoomType update(HotelRoomType hotelRoomType,Long id);

    List<HotelRoomType> findAll();

    HotelRoomType findById(Long id);

    void delete(Long id);

}

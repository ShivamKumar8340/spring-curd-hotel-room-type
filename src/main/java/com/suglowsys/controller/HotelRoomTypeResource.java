package com.suglowsys.controller;

import com.suglowsys.domain.HotelRoomType;
import com.suglowsys.service.HotelRoomTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelRoomTypeResource {

    private final HotelRoomTypeService hotelRoomTypeService;

    public HotelRoomTypeResource(HotelRoomTypeService hotelRoomTypeService) {
        this.hotelRoomTypeService = hotelRoomTypeService;
    }

    @PostMapping("/hotel-room-types")
    public HotelRoomType createHotelRoomType(@RequestBody HotelRoomType hotelRoomType){
        return hotelRoomTypeService.save(hotelRoomType);
    }

    @PutMapping("/hotel-room-types/{id}")
    public HotelRoomType updateHotelRoomType(@RequestBody HotelRoomType hotelRoomType, @PathVariable("id") Long id){
        return hotelRoomTypeService.update(hotelRoomType,id);
    }
    @GetMapping("/hotel-room-types")
    public List<HotelRoomType> getAllHotelRoomTypes() {
        List<HotelRoomType> hotelRoomTypes=hotelRoomTypeService.findAll();
        return hotelRoomTypes;

    }
    @GetMapping("/hotel-room-types/{id}")
    public HotelRoomType findByIdHotelRoomType(@PathVariable("id") Long id){
        return hotelRoomTypeService.findById(id);
    }
    @DeleteMapping("/hotel-room-types/{id}")
    public void deleteHotelRoomType(@PathVariable("id") Long id){
        hotelRoomTypeService.delete(id);
    }
}

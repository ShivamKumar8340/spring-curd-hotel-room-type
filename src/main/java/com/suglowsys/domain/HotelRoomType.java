package com.suglowsys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;
@Entity
public class HotelRoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Integer hotel_id;
    @NotNull
    private Integer room_type_id;

    public HotelRoomType() {}

    public HotelRoomType(Integer hotel_id, Integer room_type_id) {
        this.hotel_id = hotel_id;
        this.room_type_id = room_type_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRoomType that = (HotelRoomType) o;
        return Objects.equals(id, that.id) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(room_type_id, that.room_type_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hotel_id, room_type_id);
    }

    @Override
    public String toString() {
        return "hotelRoomType{" +
                "id=" + id +
                ", hotel_id=" + hotel_id +
                ", room_type_id=" + room_type_id +
                '}';
    }
}

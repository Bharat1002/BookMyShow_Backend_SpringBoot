package com.example.project.bookmyshowbackend.service.impl;

import com.example.project.bookmyshowbackend.Model.MovieEntity;
import com.example.project.bookmyshowbackend.Repository.MovieRepository;
import com.example.project.bookmyshowbackend.converter.MovieConvertor;
import com.example.project.bookmyshowbackend.dto.MovieDto;
import com.example.project.bookmyshowbackend.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieDto addMovie(MovieDto movieDto) {
        if(movieDto.getId() < 0){
            throw new EntityNotFoundException("Movie can't be found");
        }

        MovieEntity movieEntity = MovieConvertor.convertDtoToEntity(movieDto);
        movieRepository.save(movieEntity);

        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {

        MovieEntity movieEntity = movieRepository.findById(id).get();

        MovieDto movieDto = MovieConvertor.convertEntityToDto(movieEntity);

        return movieDto;
    }
}

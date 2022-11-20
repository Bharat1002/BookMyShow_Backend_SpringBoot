package com.example.project.bookmyshowbackend.service.impl;

import com.example.project.bookmyshowbackend.Model.MovieEntity;
import com.example.project.bookmyshowbackend.Repository.MovieRepository;
import com.example.project.bookmyshowbackend.converter.MovieConvertor;
import com.example.project.bookmyshowbackend.dto.EntryRequest.MovieEntryDto;
import com.example.project.bookmyshowbackend.dto.ResponseDto.MovieResponseDto;
import com.example.project.bookmyshowbackend.exception.DuplicateEntityException;
import com.example.project.bookmyshowbackend.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {

//        if(movieRepository.getMovieEntityByName(movieEntryDto.getName())==true){
//            throw new DuplicateEntityException("The movie exists already exists by this name, duplicate entry");
//        }

        MovieEntity movieEntity = MovieConvertor.convertDtoToEntity(movieEntryDto);
        movieEntity = movieRepository.save(movieEntity);

        MovieResponseDto movieResponseDto = MovieConvertor.convertEntityToDto(movieEntity);

        return movieResponseDto;
    }

    @Override
    public MovieResponseDto getMovie(int id) {

        MovieEntity movieEntity = movieRepository.findById(id).get();

        MovieResponseDto movieResponseDto = MovieConvertor.convertEntityToDto(movieEntity);

        return movieResponseDto;
    }
}

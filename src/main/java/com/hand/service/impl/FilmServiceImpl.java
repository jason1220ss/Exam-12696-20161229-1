package com.hand.service.impl;


import com.hand.dto.Film;
import com.hand.mapper.FilmMapper;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;



/**
 * Created by jason on 2016/12/29.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private ApplicationEventPublisher publisher;


    public int insert(Film film) {

        return filmMapper.insert(film);
    }
}

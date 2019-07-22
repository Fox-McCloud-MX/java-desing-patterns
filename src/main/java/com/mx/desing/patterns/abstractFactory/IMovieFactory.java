package com.mx.desing.patterns.abstractFactory;

public interface IMovieFactory {

    ITollywoodMovie getTollywoodMovie();

    IBollywoodMovie getBollywoodMovie();
}

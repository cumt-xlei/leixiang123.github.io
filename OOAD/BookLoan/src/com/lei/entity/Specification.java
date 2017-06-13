package com.lei.entity;

public interface Specification<T> {
	public boolean isSatisfiedBy(T t);
}

package com.srs.specification;

import com.srs.daomain.Section;
import com.srs.daomain.Student;

public interface Specification<T> {
	String validate(Student student, Section section);
}

package com.ttn.demo.core.config;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Class Configuration", description = "Configuration for class limits and passing marks")
public @interface ClassConfiguration {

    @AttributeDefinition(
            name = "Number of Students Allowed",
            description = "Maximum number of students allowed in a class",
            type = AttributeType.INTEGER
    )
    int maxStudents() default 30;

    @AttributeDefinition(
            name = "Passing Marks",
            description = "Minimum marks required to pass",
            type = AttributeType.INTEGER
    )
    int passingMarks() default 40;
}



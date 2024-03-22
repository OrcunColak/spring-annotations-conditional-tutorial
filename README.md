# Read me

The original idea is from  
https://medium.com/codimis/creating-conditional-beans-with-conditionalproperty-in-spring-boot-8bd1eb506d8d

# @ConditionalOnClass

This annotation ensures that the annotated bean is created only if a specified class is present in the classpath.

# @ConditionalOnMissingClass

This annotation, on the other hand, creates the bean only if a specified class is missing in the classpath.

# @ConditionalOnBean

Creates the bean only if a specified bean is present in the application context.

# @ConditionalOnMissingBean

This annotation creates the bean if a specified bean is missing from the application context.
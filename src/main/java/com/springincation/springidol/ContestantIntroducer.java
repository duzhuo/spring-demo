package com.springincation.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by MrDu on 16/1/13.
 */
@Aspect
public class ContestantIntroducer {
    @DeclareParents(value = "com.springincation.springidol.Performer+", defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}

package com.pgcomb.lang.job;

import java.util.List;

/**
 * Title: JobDispatcher <br>
 * Description: JobDispatcher <br>
 * Date: 2019年12月07日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface JobDispatcher<O,I> {

    List<O> dispense(I in);
}

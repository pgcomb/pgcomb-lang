package com.pgcomb.lang.job;

/**
 * Title: JobHandler <br>
 * Description: JobHandler <br>
 * Date: 2019年12月07日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface JobHandler<T> {
    /**
     *
     * @param mate mate
     */
    void handler(T mate);
}

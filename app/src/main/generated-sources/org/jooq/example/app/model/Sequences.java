/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.app.model;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in FLYWAY_TEST
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:FLYWAY_TEST_3"
    },
    date = "2017-05-11T21:47:26.351Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>FLYWAY_TEST.S_AUTHOR_ID</code>
     */
    public static final Sequence<Long> null_S_AUTHOR_ID = new SequenceImpl<Long>("S_AUTHOR_ID", null_FlywayTest.null_FLYWAY_TEST, org.jooq.impl.SQLDataType.BIGINT);
}

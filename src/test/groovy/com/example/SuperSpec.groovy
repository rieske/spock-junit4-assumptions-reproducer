package com.example

import spock.lang.Specification

import static org.junit.Assume.assumeTrue

class SuperSpec extends Specification {
    def setup() {
        assumeTrue(false)
    }

    def "super feature"() {
        expect:
        true
    }
}

/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.schema.generator;

import org.semarglproject.rdf.rdfa.RdfaParser
import org.semarglproject.source.StreamProcessor
import java.io.File
import java.io.FileInputStream

/**
 * @author Victor Kropp
 */

fun main(args: Array<String>) {
    val generator = GeneratorSink()
    val processor = StreamProcessor(RdfaParser.connect(generator))

    File("generator/resources").listFiles { f -> f.extension == "rdfa" }?.forEach {
        println("Processing ${it.name}")
        processor.process(FileInputStream(it), "http://schema.org/")
    }
    generator.postProcess()

    println("Generating classes")
    generator.writeJava(File("src/main/java"), "org.schema")

    println("Generating tests")
    generator.writeTests(File("test/main/java"), "org.schema")
}
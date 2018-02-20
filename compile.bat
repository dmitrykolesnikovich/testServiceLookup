@echo off
echo :compile
call mvn compile -DskipTests -DuseIncrementalCompilation=false -q

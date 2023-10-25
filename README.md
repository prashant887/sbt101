touch build.sbt
sbt
scalaVersion 
help tasks
mkdir -p src/main/scala

SBT Directories
sourceDirectories -> All Source Directories
baseDirectory -> Base Dir
scalaSource -> Sorce Files 

SBT build files has Key Value Pair 
Key Sperator Body 
name := sbt101

Types of Keys 
SettingKey : Computed Once per project Load 
TaskKey: Recomputed Verytime called 
InputKey : Accepts Command Line Args 

inspect clean/run/name/package



show randomInt
Settings : Depends on One or More Settings 
Task: Depends on one or more tasks 

Setting cant depend on task -> Setting once per load , tasks everytime called 
tasks
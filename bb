#!/bin/bash
rm -rf target
mvn assembly:assembly -DdescriptorId=jar-with-dependencies package
ls -lh target/RecipesSkill-1.0-SNAPSHOT-jar-with-dependencies.jar
aws s3 cp --acl public-read target/RecipesSkill-1.0-SNAPSHOT-jar-with-dependencies.jar s3://audioplayerskill
aws lambda update-function-code --function-name RecipesSkillJava --s3-bucket audioplayerskill --s3-key RecipesSkill-1.0-SNAPSHOT-jar-with-dependencies.jar

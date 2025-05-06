#!/bin/bash

echo "🔄 Cleaning old build files..."
rm -rf Build MyApp.jar

echo "📁 Creating Build directory..."
mkdir -p Build

echo "🧵 Compiling Java files..."
find . -name "*.java" > sources.txt

javac -d Build @sources.txt

if [ $? -ne 0 ]; then
  echo "❌ Compilation failed. Check the errors above."
  rm sources.txt
  exit 1
fi

echo "📦 Creating JAR file..."
jar cfm MyApp.jar manifest.txt -C Build .

if [ $? -eq 0 ]; then
  echo "✅ Build successful!"
  echo "▶️ Run the app with: java -jar MyApp.jar"
else
  echo "❌ Failed to create JAR file."
fi

rm sources.txt

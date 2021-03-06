docker:
	docker build jvm-debug-lab -t jvm-debug-lab


env:
	docker run --rm -it -v "$$PWD":/root/env jvm-debug-lab
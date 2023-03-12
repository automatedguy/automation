# create command to check if execution of command is successful
validate_command() {
    local command=$1
    local expected=$2
    local actual=$3
    local message=$4

    if [ "$expected" != "$actual" ]; then
        echo "ERROR: $message"
        echo "Expected: $expected"
        echo "Actual: $actual"
        echo "Command: $command"
        exit 1
    fi
}

validate_command "echo 1" "1" "$(echo 1)" "echo 1"


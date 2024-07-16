# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Hybrid planning components of MoveIt 2"
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Sebastian Jahr <sebastian.jahr@picknik.ai>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_hybrid_planning"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-components \
    std-msgs \
    std-srvs \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-components \
    std-msgs \
    std-srvs \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    controller-manager \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-resources-panda-moveit-config \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    pluginlib \
    position-controllers \
    rclcpp \
    rclcpp-action \
    rclcpp-components \
    robot-state-publisher \
    rviz2 \
    std-msgs \
    std-srvs \
    tf2-ros \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    moveit-planners-ompl \
    ros-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/moveit2-release/archive/release/humble/moveit_hybrid_planning/2.5.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/moveit_hybrid_planning"
SRC_URI = "git://github.com/moveit/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "b769fc91ef1bf6bbe372e4404ca42e3d27603c3f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

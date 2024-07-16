# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Components of MoveIt connecting to occupancy map"
AUTHOR = "Henning Kayser <henningkayser@picknik.ai>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_occupancy_map_monitor"

ROS_BUILD_DEPENDS = " \
    geometric-shapes \
    libeigen \
    moveit-common \
    moveit-core \
    moveit-msgs \
    octomap \
    pluginlib \
    rclcpp \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    geometric-shapes \
    libeigen \
    moveit-common \
    moveit-core \
    moveit-msgs \
    octomap \
    pluginlib \
    rclcpp \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    geometric-shapes \
    moveit-common \
    moveit-core \
    moveit-msgs \
    octomap \
    pluginlib \
    rclcpp \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/moveit2-release/archive/release/humble/moveit_ros_occupancy_map_monitor/2.5.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/moveit_ros_occupancy_map_monitor"
SRC_URI = "git://github.com/moveit/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "3716cac85266c59a7a6a7f491204e3e747e90278"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

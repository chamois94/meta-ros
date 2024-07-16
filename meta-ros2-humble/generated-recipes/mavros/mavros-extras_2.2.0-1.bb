# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Extra nodes and plugins for <a href="http://wiki.ros.org/mavros">MAVROS</a>."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mavros_extras"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3 & LGPLv3 & BSD-3-Clause"
LICENSE = "GPL-3.0-only & LGPL-3.0-only & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mavros"
ROS_BPN = "mavros_extras"

ROS_BUILD_DEPENDS = " \
    angles \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    rcpputils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    yaml-cpp \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    rcpputils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    yaml-cpp \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geometry-msgs \
    libmavconn \
    mavros \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    rcpputils \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    yaml-cpp \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mavros-release/archive/release/humble/mavros_extras/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/mavros_extras"
SRC_URI = "git://github.com/ros2-gbp/mavros-release;${ROS_BRANCH};protocol=https"
SRCREV = "5438a72db81b61fb5800f4164db77c0f614107d6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

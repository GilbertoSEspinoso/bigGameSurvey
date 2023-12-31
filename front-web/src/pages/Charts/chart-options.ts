export const pieOptions = {
  chart: {
    background: "transparent",
    foreColor: "red",
  },
  colors: ["#a8dadc", "#ed7947", "#00D4FF", "#ffd6a5"],
  legend: {
    show: false,
  },
  tooltip: {
    enabled: true,
  },
  dataLabels: {
    enabled: true,
    style: {
      colors: ["#a8dadc", "#ed7947", "#00D4FF", "#ffd6a5"],
      fontSize: "20px",
      fontFamily: "Play, sans-serif",
      fontWeight: 700,
    },
  },
  plotOptions: {
    pie: {
      customScale: 0.9,
      expandOnClick: true,
      dataLabels: {
        offset: 60,
      },
    },
  },
};

export const barOptions = {
  chart: {
    toolbar: {
      show: false,
    },
  },
  colors: ["#ED7947"],
  grid: {
    show: false,
  },
  plotOptions: {
    bar: {
      horizontal: true,
      borderRadius: 5,
      endingShape: "rounded",
      startingShape: "rounded",
      barHeight: "40px",
    },
  },
  dataLabels: {
    enabled: true,
  },
  tooltip: {
    enabled: false,
  },
  xaxis: {
    labels: {
      show: false,
    },
    axisBorder: {
      show: false,
    },
    axisTicks: {
      show: false,
    },
  },
  yaxis: [
    {
      labels: {
        maxWidth: 360,
        style: {
          colors: "#00D4FF",
          fontSize: "18px",
          fontFamily: "Play, sans-serif",
          fontWeight: 700,
        },
      },
    },
  ],
};
import React from 'react';
import styles from './CohortDetails.module.css'; // Import CSS Module

export const CohortDetails = ({ cohort }) => {
  const { title, startDate, status, coach, trainer } = cohort;

  // Determine header color: 'green' if status is ongoing, otherwise 'blue'[cite: 2]
  const headerStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={headerStyle}>{title}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{startDate}</dd>
        
        <dt>Current Status</dt>
        <dd>{status}</dd>
        
        <dt>Coach</dt>
        <dd>{coach}</dd>
        
        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;